package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AnodizedRoboCub_2096 : Card() {
    override val id = 2096
    override val name = "电镀机械熊仔"
    override val description = "<b>嘲讽，抉择：</b> +1攻击力；或者+1生命值。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Gvg
    override val background = "它真是太可爱了！哦我的天呐，它为什么要咬我的脸？"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9a716d49c10f5a186575061fe29dfef215dbc79ab16bbc01a0518e05a0883ae8.png"
}
