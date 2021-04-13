package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ValeeraTheHollow_43392 : Card() {
    override val id = 43392
    override val name = "虚空之影瓦莉拉"
    override val description = "<b>战吼：</b>获得<b>潜行</b>直到你的下个回合。"
    override var cost: Int? = 9
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Kotf
    override val background = "“尽管逃吧。躲进你的宝贝要塞里，躲到高墙和你的守卫后面。黑夜总要降临，暗影会占据你空洞的大厅。终有一天，其中一片暗影就是我。”"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eefdfbc74f25318b21ff49d8082e17c985139070ac8831fea16395db548c29a2.png"
}
