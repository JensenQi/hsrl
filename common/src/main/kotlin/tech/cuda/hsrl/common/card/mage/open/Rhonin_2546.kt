package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Rhonin_2546 : Card() {
    override val id = 2546
    override val name = "罗宁"
    override val description = "<b>亡语：</b>将三张奥术飞弹置入你的手牌。"
    override var cost: Int? = 8
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Tgt
    override val background = "无主之人，无冕之王。"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8356cdbee052f4dde74af4d8ddda5f0a22a36aea52ecab68dd13228764e3faa7.png"
}
