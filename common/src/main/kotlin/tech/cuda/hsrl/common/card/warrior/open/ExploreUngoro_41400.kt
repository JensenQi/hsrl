package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ExploreUngoro_41400 : Card() {
    override val id = 41400
    override val name = "探索安戈洛"
    override val description = "将你牌库里的所有卡牌替换成 “<b>发现</b>一张牌”。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Ungoro
    override val background = "我就说卡牌是树上长出来的吧，你还不信！"
    override val artist = "Jerry Mascho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/16bfca58d44cb3a3dc1743473b5e5899c5d3ba42743fe35dd44a6b38b2c826bc.png"
}
