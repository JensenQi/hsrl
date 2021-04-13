package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Woecleaver_46077 : Card() {
    override val id = 46077
    override val name = "灾厄斩杀者"
    override val description = "在你的英雄攻击后，<b>招募</b>一个 随从。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "哭脸翻过来就成了笑脸，但砍成两半就成了两张哭脸。"
    override val artist = "Matthew O'Connor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/80f805e08b9438f9819348db3e7a776fc8d3549b5d13c12326a71ae7a1c004c9.png"
}
