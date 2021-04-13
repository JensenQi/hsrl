package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SurgingTempest_54966 : Card() {
    override val id = 54966
    override val name = "电涌风暴"
    override val description = "当你有<b>过载</b>的法力水晶时，获得+1 攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“过载了？应该装个电涌保护器的。”"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b2fd17e1cf5c5724f99a07b9f32720d1445ece0e5a6bdc177e75f1c605c9a3a1.png"
}
