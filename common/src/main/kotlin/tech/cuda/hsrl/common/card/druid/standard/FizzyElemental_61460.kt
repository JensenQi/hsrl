package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FizzyElemental_61460 : Card() {
    override val id = 61460
    override val name = "泡沫元素"
    override val description = "<b>突袭</b> <b>嘲讽</b>"
    override var cost: Int? = 9
    override var health: Int? = 10
    override var attack: Int? = 10
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "爱悠悠，恨悠悠，碳酸饮料岂可休。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4f91dd8de87dd36d89eebbf93e5ed4ed7372d3e0d902d65cc203dbd65b66bf57.png"
}
