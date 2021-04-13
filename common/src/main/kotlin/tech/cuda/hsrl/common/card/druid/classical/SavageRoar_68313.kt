package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SavageRoar_68313 : Card() {
    override val id = 68313
    override val name = "野蛮咆哮"
    override val description = "在本回合中，使你的所有角色获得+2攻击力。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "显然这对火元素和水元素也有作用。难道这说明元素也是长耳朵的吗？"
    override val artist = "Grace Liu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c73cbfb52e1852a0925975f79d76505cf3e295624e5c8b3b256cfa59297c5579.png"
}
