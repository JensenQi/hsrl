package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Nethrandamus_58172 : Card() {
    override val id = 58172
    override val name = "奈瑟兰达姆斯"
    override val description = "<b>战吼：</b>随机召唤两个法力值消耗为（ ）的随从。<i> （每有一个友方随从死亡都会升级！）</i>"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "错过了巨龙降临的大潮，但它更为强大，更为灵动。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/05be1adc3297da10453f06cc55b8e2b6568e20465dc098d9a3eee29c5bc83340.png"
}
