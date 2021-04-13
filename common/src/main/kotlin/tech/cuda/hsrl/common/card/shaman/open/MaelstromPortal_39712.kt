package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MaelstromPortal_39712 : Card() {
    override val id = 39712
    override val name = "大漩涡传送门"
    override val description = "对所有敌方随从造成 1点伤害。随机召唤一个法力值消耗为（1）的随从。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Karazhan
    override val background = "坊间传闻这是当下最热门的一个度假胜地，旱鸭子和深海恐惧者谢绝前往！"
    override val artist = "Daria Tuzova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a2056a468e4de50720220f816fd1f8bd5a243cc141786b394db9964aecdef3dd.png"
}
