package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Eviscerate_904 : Card() {
    override val id = 904
    override val name = "刺骨"
    override val description = "造成 2点伤害；<b>连击：</b>改为造成 4点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy3
    override val background = "在你向对手使用刺骨时需要特别小心！一旦把手肘搭进去，那可就得不偿失了！"
    override val artist = "Ariel Olivetti"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8a083ec22e7f4e18d96eb52f5835fdf18ffa8dc9518290603f28c57e18e05f42.png"
}
