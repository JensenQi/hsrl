package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LivingSeedRank1_63030 : Card() {
    override val id = 63030
    override val name = "生命之种（等级1）"
    override val description = "抽一张野兽牌，其法力值消耗减少（1）点。<i>（当你有5点法力值时升级。）</i>"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "每一片沙漠都需要绿洲，播种生命，古夫责无旁贷。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d6ff63edbf09e84b312be0d0ab8c8bbab3bec745895df3b1b780542f68eac404.png"
}
