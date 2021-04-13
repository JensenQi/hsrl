package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Eviscerate_69853 : Card() {
    override val id = 69853
    override val name = "刺骨"
    override val description = "造成 2点伤害；<b>连击：</b>改为造成 4点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = "在你向对手使用刺骨时需要特别小心！一旦把手肘搭进去，那可就得不偿失了！"
    override val artist = "Ariel Olivetti"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/43bc78c959f86821b340f3273301fcb3824a281a148108c92f2ecacc3968bb30.png"
}
