package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GoblinPrank_48770 : Card() {
    override val id = 48770
    override val name = "地精的把戏"
    override val description = "使一个友方随从获得+3/+3和<b>突袭</b>，该随从会在回合结束时死亡。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.BoomsdayProject
    override val background = "“哈哈！快看格洛克的狼狈样……格洛克？格洛克？”"
    override val artist = "Mike Azevedo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/82000c69e52196ab355fdaca01be59f430d5012690a881e983697622a1e1f9e8.png"
}
