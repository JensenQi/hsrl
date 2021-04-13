package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Explodinator_49161 : Card() {
    override val id = 49161
    override val name = "投弹机器人"
    override val description = "<b>战吼：</b>召唤两个0/2的地精炸弹。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "有什么比一个炸弹还棒的？当然是两个炸弹啦！"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f6cb8e2e68cbb646472b8b28effb5792bb4b6046a49c82e72cae18da21b43226.png"
}
