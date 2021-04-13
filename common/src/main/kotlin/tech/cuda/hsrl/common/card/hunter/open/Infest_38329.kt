package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Infest_38329 : Card() {
    override val id = 38329
    override val name = "寄生感染"
    override val description = "使你的所有随从获得 “<b>亡语：</b>随机将一张野兽牌置入你的手牌”。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Wotog
    override val background = "作为寄生虫最有趣的一刻就是破肚而出时吓宿主一跳……好吧，他们已经是死人了。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/672463c30336beebaf8d9ce6ebe2a4a6c86ed2d47c855a596bb14491fc46057c.png"
}
