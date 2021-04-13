package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Lifedrinker_47343 : Card() {
    override val id = 47343
    override val name = "吸血蚊"
    override val description = "<b>战吼：</b>对敌方英雄造成3点伤害。为你的英雄恢复 3点生命值。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "饿昏头的时候，它也会吸零度圣水。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a3b64d877ce0e1bb7f469a360a624a81d9a1132be0ae6508b733df9083d9da39.png"
}
