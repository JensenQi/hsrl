package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KabalSongstealer_40929 : Card() {
    override val id = 40929
    override val name = "暗金教窃歌者"
    override val description = "<b>战吼：</b> <b>沉默</b>一个随从。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Msog
    override val background = "这位鸦人曾荣获加基森年度最佳作词作曲奖。"
    override val artist = "Alex Alexandrov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dd3f60d6c723962a7102568d13947f8099f0dcc09e07a4ce1ecc090fd6ce7365.png"
}
