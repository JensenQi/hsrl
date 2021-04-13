package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JadeIdol_40372 : Card() {
    override val id = 40372
    override val name = "青玉护符"
    override val description = "<b>抉择：</b>召唤一个 的<b>青玉魔像</b>；或者将该牌的三张复制洗入你的牌库。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Msog
    override val background = "如意如意，随我心意，快快显灵！"
    override val artist = "Matthew O'Connor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9ea96e42be8bef1e2787e1ea211ae3fddcc7424d3e8f9fe13758575d2f1b9e6f.png"
}
