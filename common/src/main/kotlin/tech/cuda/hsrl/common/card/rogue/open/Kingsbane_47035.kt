package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Kingsbane_47035 : Card() {
    override val id = 47035
    override val name = "弑君"
    override val description = "始终保留所有额外效果。<b>亡语：</b>将这把武器洗入你的牌库。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "杀死的每一位君王都令它黯然神伤。"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8cb08b6c086b41824998657cae71ce4c1296d0a0a7923da00a23fcbe2d6fbf36.png"
}
