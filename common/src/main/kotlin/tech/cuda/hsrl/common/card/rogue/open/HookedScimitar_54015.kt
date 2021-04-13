package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HookedScimitar_54015 : Card() {
    override val id = 54015
    override val name = "钩镰弯刀"
    override val description = "<b>连击：</b>获得+2攻击力。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "钩！钩！钩！哦嘞哦嘞哦嘞！"
    override val artist = "Grace Liu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6ddf91e45e9213863f849628150c78310dbe3c47528f0b495ce9636741658207.png"
}
