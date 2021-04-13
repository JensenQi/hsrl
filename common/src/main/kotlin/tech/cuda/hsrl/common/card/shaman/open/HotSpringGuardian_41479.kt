package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HotSpringGuardian_41479 : Card() {
    override val id = 41479
    override val name = "温泉守卫"
    override val description = "<b>嘲讽，战吼：</b> 恢复 3点生命值。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Ungoro
    override val background = "他很怀念当年和他一起守关的299位小伙伴。"
    override val artist = "Gustav Schmidt"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e25294e051c0e977c55e020b4ba035bc620c207157f683b29d5a5ba36e711cf6.png"
}
