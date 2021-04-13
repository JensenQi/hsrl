package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SergeantSally_41118 : Card() {
    override val id = 41118
    override val name = "女警萨莉"
    override val description = "<b>亡语：</b>对所有敌方随从造成等同于该随从攻击力的伤害。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "“这家伙是谁？她从哪儿来？加基森根本就没有警察局啊！”，诺格弗格市长如是说。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fb691fc2e2012f32159c30ded249a14a53442edf5f8b9cb9cf66829c6d812a5b.png"
}
