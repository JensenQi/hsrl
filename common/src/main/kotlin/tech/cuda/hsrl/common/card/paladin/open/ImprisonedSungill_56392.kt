package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ImprisonedSungill_56392 : Card() {
    override val id = 56392
    override val name = "被禁锢的阳鳃鱼人"
    override val description = "<b>休眠</b>两回合。唤醒时，召唤两个1/1的 鱼人。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.AshesOfOutland
    override val background = "它也被囚禁了一万年！可并非因为它是恶魔，而是因为它的鱼人舞蹈。"
    override val artist = "Sam Nielson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dc2651f7a6a93c3c8df698b4eea0d234e762ec2410ddb7453cf33d200d9acdee.png"
}
