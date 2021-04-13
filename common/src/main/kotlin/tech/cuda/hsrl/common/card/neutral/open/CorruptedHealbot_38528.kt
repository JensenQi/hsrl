package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CorruptedHealbot_38528 : Card() {
    override val id = 38528
    override val name = "腐化治疗机器人"
    override val description = "<b>亡语：</b>为敌方英雄恢复 8点生命值。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "竟然为敌人治疗！看来连中央处理器都被腐化了。"
    override val artist = "Jesper Ejsing"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4dfae563d8c5bdc00788868ef970c87184ad7748bd3067b86ab9b67b24520eec.png"
}
