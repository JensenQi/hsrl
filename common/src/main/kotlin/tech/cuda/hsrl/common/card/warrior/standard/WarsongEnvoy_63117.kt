package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WarsongEnvoy_63117 : Card() {
    override val id = 63117
    override val name = "战歌大使"
    override val description = "<b>暴怒：</b>每有一个受伤的角色，便获得+1攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“不让小德扛旗是什么意思？”"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/af784ec92872de1a2f4f53a487fcf97f77948b8cb5cb6b29d87baeecb0e3f33c.png"
}
