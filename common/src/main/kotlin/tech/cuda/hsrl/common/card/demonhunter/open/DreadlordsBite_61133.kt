package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DreadlordsBite_61133 : Card() {
    override val id = 61133
    override val name = "恐惧魔王之咬"
    override val description = "<b>流放：</b>对所有敌人造成1点伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "用钝了就会变成恐惧魔王之抿。"
    override val artist = "Brandon Blackwell"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/609eacd2554bc1b93a9108fbb2507863c769ee93b5e9e326fee068ef46bbc6e2.png"
}
