package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Revenge_2296 : Card() {
    override val id = 2296
    override val name = "复仇打击"
    override val description = "对所有随从造成 1点伤害。如果你的生命值小于或等于12点，则改为造成 3点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Brm
    override val background = "过去战士总是抱怨致死打击不如火球术，现在他们总算报仇了，因为复仇打击可比魔爆术好多了。"
    override val artist = "Ben Olson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ee15c1a9cf12d541346be6ec052de4e91e3a008def38b06b0a02504ed5a21058.png"
}
