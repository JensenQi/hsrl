package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeathstalkerRexxar_43398 : Card() {
    override val id = 43398
    override val name = "死亡猎手雷克萨"
    override val description = "<b>战吼：</b> 对所有敌方随从造成2点伤害。"
    override var cost: Int? = 6
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Kotf
    override val background = "“你太慢了，老朋友。狩猎已经开始很久了。现在……它永远也不会结束。”"
    override val artist = "Jomaro Kindred"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ab3812d68e7ba1e5547cc0515be58ea48c6c85c22b17bb61de831548dd0cba8e.png"
}
