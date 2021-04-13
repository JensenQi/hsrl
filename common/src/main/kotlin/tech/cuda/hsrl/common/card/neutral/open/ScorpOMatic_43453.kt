package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScorpOMatic_43453 : Card() {
    override val id = 43453
    override val name = "机械异种蝎"
    override val description = "<b>战吼：</b> 消灭一个攻击力小于或等于1的随从。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "要是在以前，我们徒手都能干掉这玩意。"
    override val artist = "Phil Saunders"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/612fe4362add17901b3c3f587c01cce398cdb8623de17acfa0c85b502488b33b.png"
}
