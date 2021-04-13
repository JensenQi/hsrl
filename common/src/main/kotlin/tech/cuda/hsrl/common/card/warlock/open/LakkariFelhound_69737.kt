package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LakkariFelhound_69737 : Card() {
    override val id = 69737
    override val name = "拉卡利地狱犬"
    override val description = "<b>嘲讽</b>，<b>战吼：</b>弃掉你手牌中法力值消耗最低的两张牌。"
    override var cost: Int? = 4
    override var health: Int? = 8
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Core
    override val background = "它这一头时髦的脏辫秘诀在于焦油。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6888ee0eb6e154dbd988431c16868b1fa28ec020b92bcda5bff8926ba759813a.png"
}
