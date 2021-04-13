package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VolatileElemental_41524 : Card() {
    override val id = 41524
    override val name = "不稳定的元素"
    override val description = "<b>亡语：</b>随机对一个敌方随从造成3点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "他和暴怒的狼人，格罗玛什·地狱咆哮还有愤怒的小鸡一同报了情绪管理课，但似乎没什么帮助。"
    override val artist = "Nicola Saviori"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ecdb63f64f11f39948ec03ae0400696fba9aef23c10af4d2639aec231455c490.png"
}
