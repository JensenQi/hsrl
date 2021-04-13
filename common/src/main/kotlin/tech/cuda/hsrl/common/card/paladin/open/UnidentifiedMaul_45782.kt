package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnidentifiedMaul_45782 : Card() {
    override val id = 45782
    override val name = "未鉴定的重槌"
    override val description = "在你手牌中时获得额外效果。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "手里拿着一把未鉴定的槌子，看什么就都像未鉴定的钉子。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6f433f0e3a96a87226691dd8a500a0a006eda6ab96b105b291d75dd3fbfe7d43.png"
}
