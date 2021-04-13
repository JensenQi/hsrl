package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Nightblade_68478 : Card() {
    override val id = 68478
    override val name = "夜刃刺客"
    override val description = "<b>战吼：</b>对敌方英雄造成3点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "你的脸可能是你最不希望被刀子碰到的地方，但却是潜行者们最喜欢下手的地方。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fa6b80e10b8fed272ce0c56c2dd90903984e9c7fb4986dc051708cf2551b3843.png"
}
