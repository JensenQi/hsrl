package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VolcanicPotion_40297 : Card() {
    override val id = 40297
    override val name = "火山药水"
    override val description = "对所有随从造成 2点伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Msog
    override val background = "卡扎库斯在药水里加入了大量的花椒。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bc8fdb9b51295fdf34f61cfdc5da34ff8cb8b112ec94b5f2b748110ddb4824f7.png"
}
