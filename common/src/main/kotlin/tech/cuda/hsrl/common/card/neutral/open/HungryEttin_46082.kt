package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HungryEttin_46082 : Card() {
    override val id = 46082
    override val name = "饥饿的双头怪"
    override val description = "<b>嘲讽，战吼：</b> 为你的对手随机召唤一个法力值消耗为（2）的随从。"
    override var cost: Int? = 6
    override var health: Int? = 10
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "两个头吃得快，饿得也快！"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6a39981dcbeec4e54f40d09994b90a92e3e893444e1bde609714f8068fb7d87a.png"
}
