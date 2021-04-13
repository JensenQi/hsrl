package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneBlast_2572 : Card() {
    override val id = 2572
    override val name = "奥术冲击"
    override val description = "对一个随从造成 2点伤害。该法术受到的<b>法术伤害</b>增益效果翻倍。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Tgt
    override val background = "双倍效果，双重感受！"
    override val artist = "Gabor Szikszai"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/23fe9af76bd997df45da1c82207fc4c34c2cc0c122f6303af67160b6909da404.png"
}
