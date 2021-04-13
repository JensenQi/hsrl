package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Nightblade_670 : Card() {
    override val id = 670
    override val name = "夜刃刺客"
    override val description = "<b>战吼：</b>对敌方英雄造成3点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "你的脸可能是你最不希望被刀子碰到的地方，但却是潜行者们最喜欢下手的地方。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f05de5e69d2ab934365ff9bcc68e16f9d10ff6587f45f67fe7a15f97bf443237.png"
}
