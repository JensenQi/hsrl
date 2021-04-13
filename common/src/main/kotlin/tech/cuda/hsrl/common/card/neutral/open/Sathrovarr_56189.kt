package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Sathrovarr_56189 : Card() {
    override val id = 56189
    override val name = "萨索瓦尔"
    override val description = "<b>战吼：</b>选择一个友方随从。将一个它的复制置入你的手牌，牌库以及战场。"
    override var cost: Int? = 9
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "稍待片刻，这张卡牌就会出现在你的口袋，你的桌上，甚至塞满你的冰箱！"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/211139495883c01c60f46fd51df257710ac27f20223c1045d2cc50b454843bf1.png"
}
