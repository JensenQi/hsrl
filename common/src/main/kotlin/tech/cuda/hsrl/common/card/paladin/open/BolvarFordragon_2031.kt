package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BolvarFordragon_2031 : Card() {
    override val id = 2031
    override val name = "伯瓦尔·弗塔根"
    override val description = "如果这张牌在你的手牌中，每当一个友方随从死亡，便获得+1攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Gvg
    override val background = "在伯瓦尔身上的冰融化之后，他受邀接受了采访。在采访中他对艾泽拉斯全球气候变暖现象表达了深深的忧虑。"
    override val artist = "Tooth"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8923a44873b679232cc1963e003aba6d778724ffd20685adc6cfa83446801374.png"
}
