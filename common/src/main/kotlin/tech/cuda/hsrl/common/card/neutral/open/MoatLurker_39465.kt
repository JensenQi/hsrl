package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MoatLurker_39465 : Card() {
    override val id = 39465
    override val name = "沟渠潜伏者"
    override val description = "<b>战吼：</b>消灭一个随从。<b>亡语：</b>再次召唤被消灭的随从。"
    override var cost: Int? = 6
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Karazhan
    override val background = "他最喜欢潜水了，只看看不说话的那种。"
    override val artist = "Jerry Mascho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2cf29081be66f502fbc0c061f494194f4cf4e07dbfc79dc5153a4d5e2ef02869.png"
}
