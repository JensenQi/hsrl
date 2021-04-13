package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HiddenCache_40339 : Card() {
    override val id = 40339
    override val name = "军备宝箱"
    override val description = "<b>奥秘：</b>在你的对手使用一张随从牌后，随机使你手牌中的一张随从牌获得+2/+2。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Msog
    override val background = "传言曾有一个污手党的菜鸟将一整瓶牛奶打翻在了军备宝箱上，于是出现了艾泽拉斯的第一个毒性污水软泥怪。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/58cba73dd8b13ce3d9c81c56b31aa04a7213c16773e528b0c34e2eab70eef8f6.png"
}
