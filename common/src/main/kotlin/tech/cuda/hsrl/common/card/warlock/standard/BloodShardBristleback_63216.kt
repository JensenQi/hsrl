package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodShardBristleback_63216 : Card() {
    override val id = 63216
    override val name = "血之碎片刺背野猪人"
    override val description = "<b>吸血</b>，<b>战吼：</b>如果你的牌库少于或等于10张，对一个随从造成6点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "背刺的背和刺和我的背不一样（耶）其他的随从全都露出一脸迷茫（耶）碎片碎在我手上让我觉得异样（耶）快转过身去让我给你当头一棒（耶）（欢迎来到贫瘠之地）"
    override val artist = "David Kegg"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/691f96219fa5e85551b76656418bbc8617426e6d1f87cbfb2ea5a9cb49016be4.png"
}
