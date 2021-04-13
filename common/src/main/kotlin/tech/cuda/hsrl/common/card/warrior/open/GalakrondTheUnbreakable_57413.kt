package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GalakrondTheUnbreakable_57413 : Card() {
    override val id = 57413
    override val name = "无敌巨龙迦拉克隆"
    override val description = "<b>战吼：</b>抽一张随从牌，使其获得+4/+4。<i>（ ）</i>"
    override var cost: Int? = 7
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.DescentOfDragons
    override val background = "大地在巨龙脚下震颤之时，砰砰博士继续说道：“……共计使用了400余吨坚固的银制风暴板甲片。”而后他按响了一个小小的遥控器。“还有豪华的销钉！”"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c48f4093da6b0a03f5608589a5b692e0ace9dccb58f9f86046829373f176c08c.png"
}
