package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RingToss_61291 : Card() {
    override val id = 61291
    override val name = "套圈圈"
    override val description = "<b>发现</b>一张<b>奥秘</b>牌并将其施放。<b>腐蚀：</b>改为<b>发现</b>两张。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "如果你喜欢它，就把这枚象征爱意的圆环戴在它手上吧！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6c4e99f26a30fe2043af8fa93f9aea883e50de15c762ec86dcb9dc6c3ed441a2.png"
}
