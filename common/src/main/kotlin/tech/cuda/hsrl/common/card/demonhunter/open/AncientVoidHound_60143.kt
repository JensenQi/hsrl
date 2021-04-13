package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncientVoidHound_60143 : Card() {
    override val id = 60143
    override val name = "上古虚空恶犬"
    override val description = "在你的回合结束时，从所有敌方随从处偷取1点攻击力和生命值。"
    override var cost: Int? = 9
    override var health: Int? = 10
    override var attack: Int? = 10
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "我的1/1的虚空狗狗怎么这样了？还有，刚才那伙人呢？！"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6cc77bfe61ccd70065017fce5e41aa7c81608357dcf03ad5de098542bbd74eb0.png"
}
