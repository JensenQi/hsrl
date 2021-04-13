package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowSculptor_56093 : Card() {
    override val id = 56093
    override val name = "暗影塑形师"
    override val description = "<b>连击：</b>在本回合中，你每使用一张其他牌，便抽一张牌。"
    override var cost: Int? = 5
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "手影艺术界的又一场灾难。"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dcf761330d8007bcdf31799d4568b1c61a11cf4544d5ab4934ebdbb05762ddf3.png"
}
