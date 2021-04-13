package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BulkUp_63130 : Card() {
    override val id = 63130
    override val name = "重装上阵"
    override val description = "随机使你手牌中的一张<b>嘲讽</b>随从牌获得+1/+1，复制该 随从牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“早餐我一般要吃两块科多肉排，五个平原陆行鸟蛋，再喝点冰凉的牛奶顺一顺……全都是生吃。”"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e7480f64b616b1bf21c6ee608bfe24ccc3a46555e1ff0e4cf33df75c92c34a7d.png"
}
