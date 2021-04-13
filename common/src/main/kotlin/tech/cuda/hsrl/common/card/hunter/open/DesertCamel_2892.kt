package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DesertCamel_2892 : Card() {
    override val id = 2892
    override val name = "大漠沙驼"
    override val description = "<b>战吼：</b>从双方的牌库中各将一个法力值消耗为（1）的随从置入战场。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Loe
    override val background = "沙漠探险怎么能不骑骆驼，难道你想自己捧着宝藏回家吗？"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e05040a3a00542c027ebded031671ffd110acdfdc6e120b7b4a30c4fbb2703c2.png"
}
