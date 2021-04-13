package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class YsielWindsinger_56682 : Card() {
    override val id = 56682
    override val name = "伊谢尔·风歌"
    override val description = "你的法术的法力值消耗为（1）点。"
    override var cost: Int? = 9
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.AshesOfOutland
    override val background = "让风浸入你的肺部深处，那是你最宝贵的财富，可以让你尽情咏唱。*但法力值消耗不能少于（1）点。"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5228affd563137662623b456eec72db712d3a6d5ed72a26ed07d17ba4cb75d77.png"
}
