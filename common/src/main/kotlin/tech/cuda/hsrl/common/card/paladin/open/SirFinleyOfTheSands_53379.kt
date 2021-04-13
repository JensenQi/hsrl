package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SirFinleyOfTheSands_53379 : Card() {
    override val id = 53379
    override val name = "沙漠爵士芬利"
    override val description = "<b>战吼：</b>如果你的牌库里没有相同的牌，则<b>发现</b>一个升级过的英雄技能。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“沙漠就是我的浩瀚大海！这只甲虫就是我的，呃，蠕行小舟！”"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/01a51d5c28eb0df70ec0ca30a011c7f71a96a585012320939cc19ec200c76673.png"
}
