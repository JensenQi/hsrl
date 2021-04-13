package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SneakyDelinquent_59914 : Card() {
    override val id = 59914
    override val name = "少年惯偷"
    override val description = "<b>潜行，亡语：</b>将一个3/1并具有<b>潜行</b>的幽灵置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "别闹了，快打开你的箱盖，说，“啊——”。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ba86f22412b123e04b1f75ebe5bc94f06d1060f12941edd3e4aa3e2f52fbbe98.png"
}
