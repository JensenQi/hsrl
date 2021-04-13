package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IceFishing_42763 : Card() {
    override val id = 42763
    override val name = "冰钓术"
    override val description = "从你的牌库中抽两张鱼人牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Kotf
    override val background = "两个鱼人两张嘴，四只眼睛，多少条腿？"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/929c9649e53dcae7032a1e1f8606fa0372b34fda203c3fa86f97cae3f09598a4.png"
}
