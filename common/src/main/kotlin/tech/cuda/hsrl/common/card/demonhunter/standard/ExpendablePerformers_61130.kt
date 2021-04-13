package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ExpendablePerformers_61130 : Card() {
    override val id = 61130
    override val name = "演员大接力"
    override val description = "召唤七个1/1并具有<b>突袭</b>的伊利达雷。在本回合中，如果他们全部死亡，再召唤七个。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "演员受了伤，观众却以为是节目效果。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/63cbd8f88e96506f262bdff9d4add16450437e7a0773eacfcc69e7adf45869f0.png"
}
