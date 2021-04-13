package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BombLobber_2067 : Card() {
    override val id = 2067
    override val name = "榴弹投手"
    override val description = "<b>战吼：</b>随机对一个敌方随从造成4点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "榴弹在手，万事无忧。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ef138238c0aee3b000730c0768b314efc099fa8248cf22799809f3564bb94edd.png"
}
